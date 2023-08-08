package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15439d;
import androidx.compose.runtime.C8578k2;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/key/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1 */
public final class C2069x6b176470 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ Map<C15434a, C2245i.C2247b> $currentKeyPressInteractions;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C12074o0 $indicationScope;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8578k2<C15094f> $keyClickOffset;
    final /* synthetic */ C11289a<C11079d2> $onClick;

    @C11067d(mo22501c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", mo22502f = "Clickable.kt", mo22503i = {}, mo22504l = {540}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1 */
    public static final class C20701 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C20701(gVar, bVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C2243g gVar = gVar;
                C2245i.C2247b bVar = bVar;
                this.label = 1;
                if (gVar.mo7604a(bVar, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C20701) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2069x6b176470(boolean z, Map<C15434a, C2245i.C2247b> map, C8578k2<C15094f> k2Var, C12074o0 o0Var, C11289a<C11079d2> aVar, C2243g gVar) {
        super(1);
        this.$enabled = z;
        this.$currentKeyPressInteractions = map;
        this.$keyClickOffset = k2Var;
        this.$indicationScope = o0Var;
        this.$onClick = aVar;
        this.$interactionSource = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo7164a(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        boolean z = true;
        if (!this.$enabled || !Clickable_androidKt.m8917g(keyEvent)) {
            if (this.$enabled && Clickable_androidKt.m8913c(keyEvent)) {
                C2245i.C2247b remove = this.$currentKeyPressInteractions.remove(C15434a.m67394B4(C15439d.m68273a(keyEvent)));
                if (remove != null) {
                    C11723c2 unused = C12038j.m48061f(this.$indicationScope, (CoroutineContext) null, (CoroutineStart) null, new C2071x8f00ca0b(this.$interactionSource, remove, (C11045c<? super C2071x8f00ca0b>) null), 3, (Object) null);
                }
                this.$onClick.invoke();
                return Boolean.valueOf(z);
            }
        } else if (!this.$currentKeyPressInteractions.containsKey(C15434a.m67394B4(C15439d.m68273a(keyEvent)))) {
            final C2245i.C2247b bVar = new C2245i.C2247b(this.$keyClickOffset.getValue().mo42242A(), (DefaultConstructorMarker) null);
            this.$currentKeyPressInteractions.put(C15434a.m67394B4(C15439d.m68273a(keyEvent)), bVar);
            C12074o0 o0Var = this.$indicationScope;
            final C2243g gVar = this.$interactionSource;
            C11723c2 unused2 = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C20701((C11045c<? super C20701>) null), 3, (Object) null);
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo7164a(((C15436b) obj).mo43922h());
    }
}
