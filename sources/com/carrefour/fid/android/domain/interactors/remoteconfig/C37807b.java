package com.carrefour.fid.android.domain.interactors.remoteconfig;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.remoteconfig.b */
public interface C37807b extends C37679f<C37808a, Boolean> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.remoteconfig.b$a */
    public static final class C37808a {
        @C12579k

        /* renamed from: a */
        public final RemoteConfigTag f94898a;

        public C37808a(@C12579k RemoteConfigTag remoteConfigTag) {
            Intrinsics.checkNotNullParameter(remoteConfigTag, "tag");
            this.f94898a = remoteConfigTag;
        }

        /* renamed from: c */
        public static /* synthetic */ C37808a m154964c(C37808a aVar, RemoteConfigTag remoteConfigTag, int i, Object obj) {
            if ((i & 1) != 0) {
                remoteConfigTag = aVar.f94898a;
            }
            return aVar.mo115196b(remoteConfigTag);
        }

        @C12579k
        /* renamed from: a */
        public final RemoteConfigTag mo115195a() {
            return this.f94898a;
        }

        @C12579k
        /* renamed from: b */
        public final C37808a mo115196b(@C12579k RemoteConfigTag remoteConfigTag) {
            Intrinsics.checkNotNullParameter(remoteConfigTag, "tag");
            return new C37808a(remoteConfigTag);
        }

        @C12579k
        /* renamed from: d */
        public final RemoteConfigTag mo115197d() {
            return this.f94898a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37808a) && this.f94898a == ((C37808a) obj).f94898a;
        }

        public int hashCode() {
            return this.f94898a.hashCode();
        }

        @C12579k
        public String toString() {
            RemoteConfigTag remoteConfigTag = this.f94898a;
            return "Params(tag=" + remoteConfigTag + ")";
        }
    }
}
