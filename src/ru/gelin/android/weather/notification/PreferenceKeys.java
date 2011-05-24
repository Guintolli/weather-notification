/*
 *  Android Weather Notification.
 *  Copyright (C) 2010  Denis Nelubin aka Gelin
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *  http://gelin.ru
 *  mailto:den@gelin.ru
 */

package ru.gelin.android.weather.notification;

/**
 *  Constants for preference keys.
 */
public interface PreferenceKeys {

    /** Enable notification preference key */
    public static final String ENABLE_NOTIFICATION = "enable_notification";
    /** Enable notification default value */
    public static final boolean ENABLE_NOTIFICATION_DEFAULT = true;
    
    /** Refresh interval preference key */
    public static final String REFRESH_INTERVAL = "refresh_interval";
    /** Refresh interval default value */
    public static final String REFRESH_INTERVAL_DEFAULT = RefreshInterval.REFRESH_1H.toString();
    
    /** Auto location preferences key */
    static final String AUTO_LOCATION = "auto_location";
    /** Auto location default value */
    static final boolean AUTO_LOCATION_DEFAULT = true;
    
    /** Manual location preferences key */
    static final String LOCATION = "location";
    /** Manual location default value */
    static final String LOCATION_DEFAULT = "";
    
    /** Skins preferences key */
    static final String SKINS = "skins";
    /** Skins install preferences key */
    static final String SKINS_INSTALL = "skins_install";

}
