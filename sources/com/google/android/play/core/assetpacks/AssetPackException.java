package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.C31957a;
import com.google.android.play.core.assetpacks.model.C31960d;
import com.google.android.play.core.tasks.C32233j;

public class AssetPackException extends C32233j {
    @C31957a

    /* renamed from: a */
    private final int f77787a;

    public AssetPackException(@C31957a int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), C31960d.m129581a(i)}));
        if (i != 0) {
            this.f77787a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @C31957a
    /* renamed from: a */
    public int mo92457a() {
        return this.f77787a;
    }
}
