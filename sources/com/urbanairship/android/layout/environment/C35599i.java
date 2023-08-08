package com.urbanairship.android.layout.environment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.environment.i */
public abstract class C35599i {
    @C12579k

    /* renamed from: a */
    public final String f88009a;

    /* renamed from: com.urbanairship.android.layout.environment.i$a */
    public static final class C35600a extends C35599i {
        @C12579k

        /* renamed from: b */
        public static final C35600a f88010b = new C35600a();

        public C35600a() {
            super("form", (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.urbanairship.android.layout.environment.i$b */
    public static final class C35601b extends C35599i {
        @C12579k

        /* renamed from: b */
        public final String f88011b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35601b(@C12579k String str) {
            super("nps", (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "scoreId");
            this.f88011b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C35601b m146907d(C35601b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f88011b;
            }
            return bVar.mo106652c(str);
        }

        @C12579k
        /* renamed from: b */
        public final String mo106651b() {
            return this.f88011b;
        }

        @C12579k
        /* renamed from: c */
        public final C35601b mo106652c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "scoreId");
            return new C35601b(str);
        }

        @C12579k
        /* renamed from: e */
        public final String mo106653e() {
            return this.f88011b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35601b) && Intrinsics.areEqual((Object) this.f88011b, (Object) ((C35601b) obj).f88011b);
        }

        public int hashCode() {
            return this.f88011b.hashCode();
        }

        @C12579k
        public String toString() {
            return "Nps(scoreId=" + this.f88011b + ')';
        }
    }

    public /* synthetic */ C35599i(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo106649a() {
        return this.f88009a;
    }

    @C12579k
    public String toString() {
        return this.f88009a;
    }

    public C35599i(String str) {
        this.f88009a = str;
    }
}
