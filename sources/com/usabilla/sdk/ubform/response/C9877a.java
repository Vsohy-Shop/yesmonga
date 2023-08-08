package com.usabilla.sdk.ubform.response;

import com.bumptech.glide.gifdecoder.C22075f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.response.a */
public abstract class C9877a<S> {

    /* renamed from: com.usabilla.sdk.ubform.response.a$a */
    public static final class C9878a<B> extends C9877a<B> {
        @C12579k

        /* renamed from: a */
        public final UbError f27087a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9878a(@C12579k UbError ubError) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(ubError, "error");
            this.f27087a = ubError;
        }

        /* renamed from: e */
        public static /* synthetic */ C9878a m37019e(C9878a aVar, UbError ubError, int i, Object obj) {
            if ((i & 1) != 0) {
                ubError = aVar.f27087a;
            }
            return aVar.mo20348d(ubError);
        }

        @C12579k
        /* renamed from: c */
        public final UbError mo20347c() {
            return this.f27087a;
        }

        @C12579k
        /* renamed from: d */
        public final C9878a<B> mo20348d(@C12579k UbError ubError) {
            Intrinsics.checkNotNullParameter(ubError, "error");
            return new C9878a<>(ubError);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9878a) && Intrinsics.areEqual((Object) this.f27087a, (Object) ((C9878a) obj).f27087a);
        }

        @C12579k
        /* renamed from: f */
        public final UbError mo20350f() {
            return this.f27087a;
        }

        public int hashCode() {
            return this.f27087a.hashCode();
        }

        @C12579k
        public String toString() {
            return "Failure(error=" + this.f27087a + ')';
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.response.a$b */
    public static final class C9879b<B> extends C9877a<B> {

        /* renamed from: a */
        public final B f27088a;

        public C9879b(B b) {
            super((DefaultConstructorMarker) null);
            this.f27088a = b;
        }

        /* renamed from: e */
        public static /* synthetic */ C9879b m37023e(C9879b bVar, B b, int i, Object obj) {
            if ((i & 1) != 0) {
                b = bVar.f27088a;
            }
            return bVar.mo20354d(b);
        }

        /* renamed from: c */
        public final B mo20353c() {
            return this.f27088a;
        }

        @C12579k
        /* renamed from: d */
        public final C9879b<B> mo20354d(B b) {
            return new C9879b<>(b);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9879b) && Intrinsics.areEqual((Object) this.f27088a, (Object) ((C9879b) obj).f27088a);
        }

        /* renamed from: f */
        public final B mo20356f() {
            return this.f27088a;
        }

        public int hashCode() {
            B b = this.f27088a;
            if (b == null) {
                return 0;
            }
            return b.hashCode();
        }

        @C12579k
        public String toString() {
            return "Success(b=" + this.f27088a + ')';
        }
    }

    public /* synthetic */ C9877a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final <C> C mo20345a(@C12579k C11300l<? super UbError, ? extends C> lVar, @C12579k C11300l<? super S, ? extends C> lVar2) {
        Intrinsics.checkNotNullParameter(lVar, "ifFailure");
        Intrinsics.checkNotNullParameter(lVar2, "ifSuccess");
        if (this instanceof C9879b) {
            return lVar2.invoke(((C9879b) this).mo20356f());
        }
        if (this instanceof C9878a) {
            return lVar.invoke(((C9878a) this).mo20350f());
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: b */
    public final <C> C9877a<C> mo20346b(@C12579k C11300l<? super S, ? extends C> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C22075f.f56695A);
        if (this instanceof C9879b) {
            return new C9879b(lVar.invoke(((C9879b) this).mo20356f()));
        }
        if (this instanceof C9878a) {
            return new C9878a(((C9878a) this).mo20350f());
        }
        throw new NoWhenBranchMatchedException();
    }

    public C9877a() {
    }
}
