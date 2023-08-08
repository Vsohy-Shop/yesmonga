package com.google.android.play.core.install;

import com.google.android.play.core.install.model.C32023c;
import com.google.android.play.core.install.model.C32026f;
import com.google.android.play.core.tasks.C32233j;

public class InstallException extends C32233j {
    @C32023c

    /* renamed from: a */
    private final int f78215a;

    public InstallException(@C32023c int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), C32026f.m129760a(i)}));
        if (i != 0) {
            this.f78215a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @C32023c
    /* renamed from: a */
    public int mo92457a() {
        return this.f78215a;
    }
}
