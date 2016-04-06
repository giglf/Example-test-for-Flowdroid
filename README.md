# Example-test-for-Flowdroid

this is an android project to test flowdroid which originates from 
https://github.com/secure-software-engineering/soot-infoflow-android/wiki

It includes two example, which distinguished by branch.
In the first example, which in the branch 1stExample, is not useful.
I don't know why. So I recommend you to test with 2enExample.

To use 2enExample, you should import the project to eclipse.
Because this is an android 4.2.2 project under eclipse.
Or you can config yourselves.

For convenience, I left the test keystore in the projectm which password is 123456.
(In fact I just forgot to delete it. = =)

After you get the apk, you can set source and sink in the flowdroid to test it.
Like
<pre><code>
	&lt;com.example.testflowdroid.MainActivity: int source()&gt; -> _SOURCE_
	&lt;com.example.testflowdroid.MainActivity: void sink(int)&gt; -> _SINK_
</pre></code>

And then you can run your flowdroid to check it.