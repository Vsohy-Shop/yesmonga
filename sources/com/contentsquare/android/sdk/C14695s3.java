package com.contentsquare.android.sdk;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.contentsquare.android.sdk.s3 */
public class C14695s3 {

    /* renamed from: a */
    public static final Random f36378a = new Random();

    /* renamed from: a */
    public int mo36375a() {
        return mo36376b();
    }

    /* renamed from: b */
    public int mo36376b() {
        return ThreadLocalRandom.current().nextInt(100);
    }

    /* renamed from: c */
    public int mo36377c() {
        return f36378a.nextInt(100);
    }
}
