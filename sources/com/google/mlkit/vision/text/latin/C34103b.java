package com.google.mlkit.vision.text.latin;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.vision.text.C34079e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.mlkit.vision.text.latin.b */
public class C34103b implements C34079e {
    @RecentlyNonNull

    /* renamed from: h */
    public static final C34103b f82765h = new C34104a().mo99063a();
    @C0344h1

    /* renamed from: f */
    public final AtomicReference<Boolean> f82766f = new AtomicReference<>();
    @C0363p0

    /* renamed from: g */
    public final Executor f82767g;

    /* renamed from: com.google.mlkit.vision.text.latin.b$a */
    public static class C34104a {
        @C0363p0

        /* renamed from: a */
        public Executor f82768a;

        @C0359n0
        /* renamed from: a */
        public C34103b mo99063a() {
            return new C34103b(this.f82768a, (C34105c) null);
        }

        @C0359n0
        /* renamed from: b */
        public C34104a mo99064b(@RecentlyNonNull Executor executor) {
            this.f82768a = executor;
            return this;
        }
    }

    public /* synthetic */ C34103b(Executor executor, C34105c cVar) {
        this.f82767g = executor;
    }

    @RecentlyNullable
    /* renamed from: a */
    public final Executor mo99045a() {
        return this.f82767g;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final String mo99046b() {
        return true != mo99047c() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    /* renamed from: c */
    public final boolean mo99047c() {
        boolean z;
        if (this.f82766f.get() != null) {
            return this.f82766f.get().booleanValue();
        }
        if (DynamiteModule.m166877a(C33947j.m136584c().mo98718b(), ModuleDescriptor.MODULE_ID) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f82766f.set(Boolean.valueOf(z));
        return z;
    }

    /* renamed from: d */
    public final int mo99048d() {
        return mo99047c() ? 24317 : 24306;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public final String mo99049e() {
        return true != mo99047c() ? "com.google.android.gms.vision.ocr" : ModuleDescriptor.MODULE_ID;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34103b)) {
            return false;
        }
        return C40808s.m166010b(this.f82767g, ((C34103b) obj).f82767g);
    }

    @C34079e.C34080a
    /* renamed from: f */
    public final int mo99050f() {
        return 1;
    }

    @RecentlyNonNull
    /* renamed from: g */
    public final String mo99051g() {
        return true != mo99047c() ? "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator" : "com.google.mlkit.vision.text.bundled.latin.BundledLatinTextRecognizerCreator";
    }

    public int hashCode() {
        return C40808s.m166011c(this.f82767g);
    }
}
