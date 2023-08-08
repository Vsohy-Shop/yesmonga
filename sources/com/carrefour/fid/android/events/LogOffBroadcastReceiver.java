package com.carrefour.fid.android.events;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import dagger.hilt.C10262b;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\t\u000bB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/events/LogOffBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lkotlin/d2;", "onReceive", "Lcom/carrefour/fid/android/events/LogOffBroadcastReceiver$b;", "a", "Lkotlin/z;", "b", "()Lcom/carrefour/fid/android/events/LogOffBroadcastReceiver$b;", "entryPoint", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class LogOffBroadcastReceiver extends BroadcastReceiver {
    @C12579k

    /* renamed from: b */
    public static final C38231a f96874b = new C38231a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f96875c = 8;
    @C12579k

    /* renamed from: d */
    public static final String f96876d = "com.carrefour.fid.android.logoff";
    @C12579k

    /* renamed from: a */
    public final C11677z f96877a = C10864b0.m38748c(LogOffBroadcastReceiver$entryPoint$2.f96878f);

    /* renamed from: com.carrefour.fid.android.events.LogOffBroadcastReceiver$a */
    public static final class C38231a {
        public /* synthetic */ C38231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C38231a() {
        }
    }

    @C10267e({C10265a.class})
    @C10262b
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/events/LogOffBroadcastReceiver$b;", "", "Lcom/carrefour/fid/android/domain/interactors/account/g;", "m", "Lkotlinx/coroutines/o0;", "k", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.events.LogOffBroadcastReceiver$b */
    public interface C38232b {
        @C28659c
        @C12579k
        /* renamed from: k */
        C12074o0 mo34008k();

        @C12579k
        /* renamed from: m */
        C37521g mo34021m();
    }

    /* renamed from: b */
    public final C38232b mo119676b() {
        return (C38232b) this.f96877a.getValue();
    }

    public void onReceive(@C12580l Context context, @C12580l Intent intent) {
        C11723c2 unused = C12038j.m48061f(mo119676b().mo34008k(), (CoroutineContext) null, (CoroutineStart) null, new LogOffBroadcastReceiver$onReceive$1(this, context, (C11045c<? super LogOffBroadcastReceiver$onReceive$1>) null), 3, (Object) null);
    }
}
