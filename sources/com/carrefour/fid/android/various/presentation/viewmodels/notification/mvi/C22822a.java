package com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi;

import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.various.domain.model.AppMessage;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a */
public final class C22822a {
    @C12579k

    /* renamed from: a */
    public static final C22822a f58389a = new C22822a();

    /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a */
    public interface C22823a extends C28505u.C28506a {

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$a */
        public static final class C22824a implements C22823a {
            @C12579k

            /* renamed from: a */
            public final String f58390a;

            public C22824a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                this.f58390a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C22824a m103088c(C22824a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f58390a;
                }
                return aVar.mo67275b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo67274a() {
                return this.f58390a;
            }

            @C12579k
            /* renamed from: b */
            public final C22824a mo67275b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                return new C22824a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo67276d() {
                return this.f58390a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C22824a) && Intrinsics.areEqual((Object) this.f58390a, (Object) ((C22824a) obj).f58390a);
            }

            public int hashCode() {
                return this.f58390a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f58390a;
                return "ExecuteMessageAction(url=" + str + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$b */
        public static final class C22825b implements C22823a {
            @C12579k

            /* renamed from: a */
            public static final C22825b f58391a = new C22825b();
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$c */
        public static final class C22826c implements C22823a {
            @C12579k

            /* renamed from: a */
            public static final C22826c f58392a = new C22826c();
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$a$d */
        public static final class C22827d implements C22823a {
            @C12579k

            /* renamed from: a */
            public static final C22827d f58393a = new C22827d();
        }
    }

    /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b */
    public interface C22828b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$a */
        public static final class C22829a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m103092a(@C12579k C22828b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$b */
        public static final class C22830b implements C22828b {
            @C12579k

            /* renamed from: b */
            public static final C22830b f58394b = new C22830b();

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C22829a.m103092a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$c */
        public static final class C22831c implements C22828b {
            @C12579k

            /* renamed from: b */
            public static final C22831c f58395b = new C22831c();

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C22829a.m103092a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$b$d */
        public static final class C22832d implements C22828b {
            @C12579k

            /* renamed from: b */
            public final AppMessage f58396b;

            public C22832d(@C12579k AppMessage appMessage) {
                Intrinsics.checkNotNullParameter(appMessage, "message");
                this.f58396b = appMessage;
            }

            /* renamed from: g */
            public static /* synthetic */ C22832d m103093g(C22832d dVar, AppMessage appMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    appMessage = dVar.f58396b;
                }
                return dVar.mo67282f(appMessage);
            }

            @C12579k
            /* renamed from: e */
            public final AppMessage mo67280e() {
                return this.f58396b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C22832d) && Intrinsics.areEqual((Object) this.f58396b, (Object) ((C22832d) obj).f58396b);
            }

            @C12579k
            /* renamed from: f */
            public final C22832d mo67282f(@C12579k AppMessage appMessage) {
                Intrinsics.checkNotNullParameter(appMessage, "message");
                return new C22832d(appMessage);
            }

            @C12579k
            /* renamed from: h */
            public final AppMessage mo67283h() {
                return this.f58396b;
            }

            public int hashCode() {
                return this.f58396b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C22829a.m103092a(this);
            }

            @C12579k
            public String toString() {
                AppMessage appMessage = this.f58396b;
                return "Notification(message=" + appMessage + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c */
    public interface C22833c extends C28505u.C28507b {

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c$a */
        public static final class C22834a implements C22833c {
            @C12579k

            /* renamed from: a */
            public static final C22834a f58397a = new C22834a();
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c$b */
        public static final class C22835b implements C22833c {
            @C12579k

            /* renamed from: a */
            public static final C22835b f58398a = new C22835b();
        }

        /* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.a$c$c */
        public static final class C22836c implements C22833c {
            @C12579k

            /* renamed from: a */
            public static final C22836c f58399a = new C22836c();
        }
    }
}
