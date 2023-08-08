package com.carrefour.fid.android.scan.presentation.viewmodels.mvi;

import androidx.camera.core.C1353a2;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import com.carrefour.fid.android.scan.presentation.p042ui.C28310g;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a */
public final class C28318a {
    @C12579k

    /* renamed from: a */
    public static final C28318a f68485a = new C28318a();

    /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a */
    public interface C28319a extends C28505u.C28506a {

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a$a */
        public static final class C28320a implements C28319a {
            @C12579k

            /* renamed from: a */
            public final Throwable f68486a;

            public C28320a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f68486a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C28320a m118290c(C28320a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f68486a;
                }
                return aVar.mo82289b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo82288a() {
                return this.f68486a;
            }

            @C12579k
            /* renamed from: b */
            public final C28320a mo82289b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C28320a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo82290d() {
                return this.f68486a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28320a) && Intrinsics.areEqual((Object) this.f68486a, (Object) ((C28320a) obj).f68486a);
            }

            public int hashCode() {
                return this.f68486a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f68486a;
                return "Error(throwable=" + th + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a$b */
        public static final class C28321b implements C28319a {
            @C12579k

            /* renamed from: a */
            public final String f68487a;

            public C28321b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "data");
                this.f68487a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C28321b m118294c(C28321b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f68487a;
                }
                return bVar.mo82295b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo82294a() {
                return this.f68487a;
            }

            @C12579k
            /* renamed from: b */
            public final C28321b mo82295b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "data");
                return new C28321b(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo82296d() {
                return this.f68487a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28321b) && Intrinsics.areEqual((Object) this.f68487a, (Object) ((C28321b) obj).f68487a);
            }

            public int hashCode() {
                return this.f68487a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f68487a;
                return "ScannedResult(data=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b */
    public interface C28322b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$a */
        public static final class C28323a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m118298a(@C12579k C28322b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$b */
        public static final class C28324b implements C28322b {
            @C12579k

            /* renamed from: b */
            public static final C28324b f68488b = new C28324b();

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28323a.m118298a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$c */
        public static final class C28325c implements C28322b {
            @C12579k

            /* renamed from: b */
            public static final C28325c f68489b = new C28325c();

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28323a.m118298a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$d */
        public static final class C28326d implements C28322b {
            @C12579k

            /* renamed from: b */
            public static final C28326d f68490b = new C28326d();

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28323a.m118298a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$e */
        public static final class C28327e implements C28322b {
            @C12579k

            /* renamed from: b */
            public static final C28327e f68491b = new C28327e();

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28323a.m118298a(this);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$c */
    public interface C28328c extends C28505u.C28507b {

        /* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$c$a */
        public static final class C28329a implements C28328c {
            @C12579k

            /* renamed from: a */
            public final C1353a2 f68492a;
            @C12579k

            /* renamed from: b */
            public final ScanType f68493b;

            public C28329a(@C12579k C1353a2 a2Var, @C12579k ScanType scanType) {
                Intrinsics.checkNotNullParameter(a2Var, "imageProxy");
                Intrinsics.checkNotNullParameter(scanType, C28310g.f68481a);
                this.f68492a = a2Var;
                this.f68493b = scanType;
            }

            /* renamed from: d */
            public static /* synthetic */ C28329a m118299d(C28329a aVar, C1353a2 a2Var, ScanType scanType, int i, Object obj) {
                if ((i & 1) != 0) {
                    a2Var = aVar.f68492a;
                }
                if ((i & 2) != 0) {
                    scanType = aVar.f68493b;
                }
                return aVar.mo82302c(a2Var, scanType);
            }

            @C12579k
            /* renamed from: a */
            public final C1353a2 mo82300a() {
                return this.f68492a;
            }

            @C12579k
            /* renamed from: b */
            public final ScanType mo82301b() {
                return this.f68493b;
            }

            @C12579k
            /* renamed from: c */
            public final C28329a mo82302c(@C12579k C1353a2 a2Var, @C12579k ScanType scanType) {
                Intrinsics.checkNotNullParameter(a2Var, "imageProxy");
                Intrinsics.checkNotNullParameter(scanType, C28310g.f68481a);
                return new C28329a(a2Var, scanType);
            }

            @C12579k
            /* renamed from: e */
            public final C1353a2 mo82303e() {
                return this.f68492a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28329a)) {
                    return false;
                }
                C28329a aVar = (C28329a) obj;
                return Intrinsics.areEqual((Object) this.f68492a, (Object) aVar.f68492a) && this.f68493b == aVar.f68493b;
            }

            @C12579k
            /* renamed from: f */
            public final ScanType mo82305f() {
                return this.f68493b;
            }

            public int hashCode() {
                return (this.f68492a.hashCode() * 31) + this.f68493b.hashCode();
            }

            @C12579k
            public String toString() {
                C1353a2 a2Var = this.f68492a;
                ScanType scanType = this.f68493b;
                return "ProcessScannedImage(imageProxy=" + a2Var + ", scanType=" + scanType + ")";
            }
        }
    }
}
