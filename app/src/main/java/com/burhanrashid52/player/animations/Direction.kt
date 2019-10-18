package com.kamleshgorasiya.player.animations

/**
 * Created by Kamlesh Gorasiya on 2/27/2018.
 */

/**
 * Direction sealed class used as enum for defining directions
 */
sealed class Direction {
    class LEFT : Direction()
    class RIGHT : Direction()
    class UP : Direction()
    class DOWN : Direction()
    class NONE : Direction()
}