Auto-Refresh Browser
==============

This is my fork of the zirco-browser.



Features Added to the original code:
* If the page timed out, wait 20 seconds, then refresh the page.
* Hide the address bar when loading the page.

The reason I needed the modifications above is because I have an application which is a set of .php web pages that redirect from one to the next every 10 seconds. When the page would redirect the address bar would appear, which took away from the whole appearance of seamless switching.

Secondly there are times when the Gooseberry Board (Which is running Android 4.0) would lose Wi-Fi connection, thus halting the whole redirection sequence. By having the browser auto-refresh every 20 seconds when it encounters this, the problem is rectified.

Hopefully others will find this useful as well.

Enjoy,

Dave Umrysh



Notes
------------

If you have never cloned an Android repo before please read the information on this page.
[http://blog.donnfelker.com](http://blog.donnfelker.com/2010/07/06/android-must-override-a-superclass-method-errors/)

Also I have only tested this app on Android 4.0

If you would like a prebuilt .apk of this browser please send me an [email](http://www.umrysh.com/?page_id=626)

Contributing
------------

Feel free to fork and send [pull requests](http://help.github.com/fork-a-repo/).  Contributions welcome.

License
-------

This is open source software released under the GNU GENERAL PUBLIC LICENSE V3.