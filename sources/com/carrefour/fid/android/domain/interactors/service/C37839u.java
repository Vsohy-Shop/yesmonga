package com.carrefour.fid.android.domain.interactors.service;

import com.carrefour.fid.android.domain.interactors.C37679f;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.service.u */
public interface C37839u extends C37679f<C37840a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.service.u$a */
    public static final class C37840a {
        @C12579k

        /* renamed from: a */
        public final String f94916a;
        @C12579k

        /* renamed from: b */
        public final String f94917b;

        public C37840a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "anabelKey");
            Intrinsics.checkNotNullParameter(str2, "metiRef");
            this.f94916a = str;
            this.f94917b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37840a m155019d(C37840a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94916a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94917b;
            }
            return aVar.mo115260c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115258a() {
            return this.f94916a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo115259b() {
            return this.f94917b;
        }

        @C12579k
        /* renamed from: c */
        public final C37840a mo115260c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "anabelKey");
            Intrinsics.checkNotNullParameter(str2, "metiRef");
            return new C37840a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo115261e() {
            return this.f94916a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37840a)) {
                return false;
            }
            C37840a aVar = (C37840a) obj;
            return Intrinsics.areEqual((Object) this.f94916a, (Object) aVar.f94916a) && Intrinsics.areEqual((Object) this.f94917b, (Object) aVar.f94917b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115263f() {
            return this.f94917b;
        }

        public int hashCode() {
            return (this.f94916a.hashCode() * 31) + this.f94917b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94916a;
            String str2 = this.f94917b;
            return "Param(anabelKey=" + str + ", metiRef=" + str2 + ")";
        }
    }
}
