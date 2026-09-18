/*
 * SPDX-FileCopyrightText: 2021 The OrionOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package orionos.app;

/** @hide */
interface ILineageGlobalActions {

    void updateUserConfig(boolean enabled, String action);

    List<String> getLocalUserConfig();

    String[] getUserActionsArray();

    boolean userConfigContains(String preference);
}
