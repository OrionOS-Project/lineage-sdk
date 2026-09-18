/*
 * SPDX-FileCopyrightText: 2018 The OrionOS project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.orionos.internal.applications;

import android.content.Context;

public class LineageActivityManager {
    private Context mContext;

    // Long screen related activity settings
    private LongScreen mLongScreen;

    public LineageActivityManager(Context context) {
        mContext = context;

        mLongScreen = new LongScreen(context);
    }

    public boolean shouldForceLongScreen(String packageName) {
        return mLongScreen.shouldForceLongScreen(packageName);
    }
}
