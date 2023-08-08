package com.carrefour.fid.android.utils.initializer;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.startup.C20496b;
import com.carrefour.fid.android.core.p056di.providers.C36293a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.google.firebase.C33033f;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11970i;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/utils/initializer/FirebaseAppInitializer;", "Landroidx/startup/b;", "Lkotlin/d2;", "Landroid/content/Context;", "context", "b", "", "Ljava/lang/Class;", "dependencies", "Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;", "a", "Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;", "c", "()Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;", "d", "(Lcom/carrefour/fid/android/shared/data/datastore/pref/BaseAppPreferencesStorage;)V", "baseAppPreferencesStorage", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class FirebaseAppInitializer implements C20496b<C11079d2> {

    /* renamed from: b */
    public static final int f58184b = 8;
    @Inject

    /* renamed from: a */
    public BaseAppPreferencesStorage f58185a;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo55933a(Context context) {
        mo67124b(context);
        return C11079d2.f28267a;
    }

    /* renamed from: b */
    public void mo67124b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36293a.f89629a.mo108299a(context).mo33974f(this);
        C33033f.m133336x(context);
        Object unused = C11970i.m47708b((CoroutineContext) null, new FirebaseAppInitializer$create$1(this, (C11045c<? super FirebaseAppInitializer$create$1>) null), 1, (Object) null);
    }

    @C12579k
    /* renamed from: c */
    public final BaseAppPreferencesStorage mo67125c() {
        BaseAppPreferencesStorage baseAppPreferencesStorage = this.f58185a;
        if (baseAppPreferencesStorage != null) {
            return baseAppPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseAppPreferencesStorage");
        return null;
    }

    /* renamed from: d */
    public final void mo67126d(@C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "<set-?>");
        this.f58185a = baseAppPreferencesStorage;
    }

    @C12579k
    public List<Class<? extends C20496b<?>>> dependencies() {
        return new ArrayList();
    }
}
