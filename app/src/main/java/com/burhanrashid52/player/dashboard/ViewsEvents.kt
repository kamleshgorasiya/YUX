package com.kamleshgorasiya.player.dashboard

/**
 * Created by Kamlesh Gorasiya on 2/27/2018.
 */

/**
 * ViewsEvents sealed class used as enum for defining different events for views
 */
sealed class ViewsEvents {
    class CLICKED : ViewsEvents()
    class SHOW : ViewsEvents()
    class HIDE : ViewsEvents()
    class LONGPRESS : ViewsEvents()
    class NONE : ViewsEvents()
}