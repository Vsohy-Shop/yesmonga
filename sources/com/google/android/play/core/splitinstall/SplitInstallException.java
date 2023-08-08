package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.C32183a;
import com.google.android.play.core.splitinstall.model.C32185c;
import com.google.android.play.core.tasks.C32233j;

public class SplitInstallException extends C32233j {
    @C32183a

    /* renamed from: a */
    private final int f78388a;

    public SplitInstallException(@C32183a int i) {
        super(String.format("Split Install Error(%d): %s", new Object[]{Integer.valueOf(i), C32185c.m130216a(i)}));
        if (i != 0) {
            this.f78388a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @C32183a
    /* renamed from: a */
    public int mo92457a() {
        return this.f78388a;
    }
}
