package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.C0266a;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000b\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"I", "O", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$a", "a", "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$a;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements C11289a<C0253a> {
    final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* renamed from: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$a */
    public static final class C0253a extends C0266a<C11079d2, O> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultCallerLauncher<I, O> f759a;

        public C0253a(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
            this.f759a = activityResultCallerLauncher;
        }

        /* renamed from: c */
        public O mo870c(int i, @C12580l Intent intent) {
            return this.f759a.mo863e().mo870c(i, intent);
        }

        @C12579k
        /* renamed from: d */
        public Intent mo869a(@C12579k Context context, @C12579k C11079d2 d2Var) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(d2Var, "input");
            return this.f759a.mo863e().mo869a(context, this.f759a.mo864f());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    @C12579k
    /* renamed from: a */
    public final C0253a invoke() {
        return new C0253a(this.this$0);
    }
}
