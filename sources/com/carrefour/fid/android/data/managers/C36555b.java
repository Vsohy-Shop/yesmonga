package com.carrefour.fid.android.data.managers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C11395k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "to be removed and replaced by LoginRepository in account module")
@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.managers.b */
public final class C36555b {
    @C12579k

    /* renamed from: c */
    public static final C36556a f90279c = new C36556a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f90280d = (LoginRepository.f32381c | LocalLoginDataSource.f32335e);
    @C12579k

    /* renamed from: e */
    public static final String f90281e = "LoginManager";
    @C12579k

    /* renamed from: a */
    public final LocalLoginDataSource f90282a;
    @C12579k

    /* renamed from: b */
    public final LoginRepository f90283b;

    /* renamed from: com.carrefour.fid.android.data.managers.b$a */
    public static final class C36556a {
        public /* synthetic */ C36556a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36556a() {
        }
    }

    @Inject
    public C36555b(@C12579k LocalLoginDataSource localLoginDataSource, @C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(localLoginDataSource, "localLoginDataSource");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f90282a = localLoginDataSource;
        this.f90283b = loginRepository;
    }

    /* renamed from: a */
    public final void mo111418a() {
        this.f90282a.mo31133b();
    }

    @C12579k
    /* renamed from: b */
    public final String mo111419b() {
        return this.f90283b.mo31350b();
    }

    /* renamed from: c */
    public final long mo111420c() {
        return C13181d.m57144c(mo111422e());
    }

    @C12579k
    /* renamed from: d */
    public final String mo111421d() {
        return this.f90283b.mo31352d();
    }

    @C12580l
    /* renamed from: e */
    public final AuthStateResponse mo111422e() {
        return this.f90282a.mo31136e();
    }

    /* renamed from: f */
    public final boolean mo111423f() {
        return C13181d.m57146e(mo111422e());
    }
}
