package com.carrefour.fid.android.account.presentation.p018ui.create;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.a */
public interface C13488a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.ui.create.a$a */
    public static final class C13489a implements C13488a {
        @C12579k

        /* renamed from: a */
        public static final C13489a f32964a = new C13489a();

        /* renamed from: b */
        public static final int f32965b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.ui.create.a$b */
    public static final class C13490b implements C13488a {

        /* renamed from: b */
        public static final int f32966b = 0;
        @C12579k

        /* renamed from: a */
        public final String f32967a;

        public C13490b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            this.f32967a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C13490b m58002c(C13490b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f32967a;
            }
            return bVar.mo32051b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo32050a() {
            return this.f32967a;
        }

        @C12579k
        /* renamed from: b */
        public final C13490b mo32051b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            return new C13490b(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo32052d() {
            return this.f32967a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13490b) && Intrinsics.areEqual((Object) this.f32967a, (Object) ((C13490b) obj).f32967a);
        }

        public int hashCode() {
            return this.f32967a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f32967a;
            return "OnExternalLinkClicked(url=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.ui.create.a$c */
    public static final class C13491c implements C13488a {
        @C12579k

        /* renamed from: a */
        public static final C13491c f32968a = new C13491c();

        /* renamed from: b */
        public static final int f32969b = 0;
    }
}
