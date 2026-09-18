/*
 * SPDX-FileCopyrightText: 2015 The CyanogenMod Project
 * SPDX-License-Identifier: Apache-2.0
 */

package orionos.content;

import android.Manifest;

/**
 * OrionOS specific intent definition class.
 */
public class Intent {

    /**
     * Activity Action: Start action associated with long press on the recents key.
     * <p>Input: {@link #EXTRA_LONG_PRESS_RELEASE} is set to true if the long press
     * is released
     * <p>Output: Nothing
     */
    public static final String ACTION_RECENTS_LONG_PRESS =
            "orionos.intent.action.RECENTS_LONG_PRESS";

    /**
     * This field is part of the intent {@link #ACTION_RECENTS_LONG_PRESS}.
     * The type of the extra is a boolean that indicates if the long press
     * is released.
     */
    public static final String EXTRA_RECENTS_LONG_PRESS_RELEASE =
            "orionos.intent.extra.RECENTS_LONG_PRESS_RELEASE";

    /**
     * Broadcast action: notify the system that the user has performed a gesture on the screen
     * to launch the camera. Broadcast should be protected to receivers holding the
     * {@link Manifest.permission#STATUS_BAR_SERVICE} permission.
     */
    public static final String ACTION_SCREEN_CAMERA_GESTURE =
            "orionos.intent.action.SCREEN_CAMERA_GESTURE";

    /**
     * Broadcast action: perform any initialization required for LineageHW services.
     * Runs when the service receives the signal the device has booted, but
     * should happen before {@link android.content.Intent#ACTION_BOOT_COMPLETED}.
     *
     * Requires {@link orionos.platform.Manifest.permission#HARDWARE_ABSTRACTION_ACCESS}.
     */
    public static final String ACTION_INITIALIZE_LINEAGE_HARDWARE =
            "orionos.intent.action.INITIALIZE_LINEAGE_HARDWARE";

    /**
     * Broadcast action: lid state changed
     */
    public static final String ACTION_LID_STATE_CHANGED =
            "orionos.intent.action.LID_STATE_CHANGED";

    /**
     * This field is part of the intent {@link #ACTION_LID_STATE_CHANGED}.
     * Intent extra field for the state of lid/cover
     */
    public static final String EXTRA_LID_STATE =
            "orionos.intent.extra.LID_STATE";

    /**
     * Broadcast action: notify SystemUI that LiveDisplay service has finished initialization.
     */
    public static final String ACTION_INITIALIZE_LIVEDISPLAY =
            "orionos.intent.action.INITIALIZE_LIVEDISPLAY";
}
