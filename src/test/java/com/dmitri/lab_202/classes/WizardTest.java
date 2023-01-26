package com.dmitri.lab_202.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    public Warrior targetPlayer;
    public Wizard attackerPlayer;

    @BeforeEach
    void setUp() {
        targetPlayer = new Warrior(123,5,30);
        attackerPlayer = new Wizard(123,5,60);
    }

    @Test
    void attack_player_reduceTargetPlayerHealth() {
        attackerPlayer.attack(targetPlayer);
        assertEquals(95,targetPlayer.getHealth());
    }
    @Test
    void attack_playerWithLowHealth_reduceTargetPlayerHealthToZero() {
        targetPlayer.setHealth(3);
        attackerPlayer.attack(targetPlayer);
        assertEquals(0,targetPlayer.getHealth());
    }
    @Test
    void attack_player_playerWithZeroStraight_dontReduceHealth() {
        attackerPlayer.setStrength(0);
        attackerPlayer.attack(targetPlayer);
        assertEquals(100,targetPlayer.getHealth());
    }
}