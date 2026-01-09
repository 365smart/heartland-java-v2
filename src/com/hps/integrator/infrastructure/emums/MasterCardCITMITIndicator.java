package com.hps.integrator.infrastructure.emums;

/**
 * Enumeration for MasterCard CIT/MIT indicators
 * Used specifically for MasterCard transactions to indicate the type of transaction
 */
public enum MasterCardCITMITIndicator {

    CARDHOLDER_INITIATED_SUBSCRIPTION,

    MERCHANT_INITIATED_SUBSCRIPTION,

    MERCHANT_INITIATED_RESUBMISSION,

    CARDHOLDER_INITIATED_RECURRING,

    MERCHANT_INITIATED_RECURRING
}