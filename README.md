# Example-test-for-Flowdroid

this is an android project to test flowdroid which originates from 
https://github.com/secure-software-engineering/soot-infoflow-android/wiki

It includes three examples, which distinguished by branch.

<h3>1st Example</h3>
In the first example, which in the branch 1stExample, is not useful.
I don't know why. So I recommend you to test with 2enExample.

<h3>2nd Example</h3>
To use 2enExample, you should import the project to eclipse.
Because this is an android 4.2.2 project under eclipse.
Or you can config yourselves.

For convenience, I left the test keystore in the projectm which password is 123456.
(In fact I just forgot to delete it. = =)

After you get the apk, you can set source and sink in the flowdroid to test it.
Like
<pre><code>
	&lt;com.example.testflowdroid.MainActivity: int source()&gt; -> \_SOURCE\_
	&lt;com.example.testflowdroid.MainActivity: void sink(int)&gt; -> \_SINK\_
</pre></code>

And then you can run your flowdroid to check it.

------
<h3>3rd Example</h3>
And this time I add the third example.

You can switch to branch 3rdExample to use the Third example.

About this example. It is a bit different to the second, which should use the source and sink below.

<pre><code>
	&lt;com.example.testflowdroid.MainActivity: java.lang.String source()&gt; -> \_SOURCE\_
	&lt;com.example.testflowdroid.MainActivity: void sink(java.lang.String)&gt; -> \_SINK\_
</pre></code>

The difference is the String from source have been process.
For eample, the raw password is (String) "123456". And the password after process is "1-2-3-4-5-6". It still include the informations of the password. And can be use by hacker.
Finally, it proves that the Flowdroid can also detect that flow.(Just like it said in the paper)

In addition, I also defined another String named flaw_password, which only contain the half of the raw_password.
And finally, I found it won't be detected.
