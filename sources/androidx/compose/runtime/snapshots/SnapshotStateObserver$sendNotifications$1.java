package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,549:1\n460#2,11:550\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n84#1:550,11\n*E\n"})
public final class SnapshotStateObserver$sendNotifications$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.this$0 = snapshotStateObserver;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke() {
        do {
            C8423g d = this.this$0.f23148f;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (d) {
                if (!snapshotStateObserver.f23145c) {
                    snapshotStateObserver.f23145c = true;
                    try {
                        C8423g d2 = snapshotStateObserver.f23148f;
                        int h0 = d2.mo15469h0();
                        if (h0 > 0) {
                            Object[] d0 = d2.mo15462d0();
                            int i = 0;
                            do {
                                ((SnapshotStateObserver.ObservedScopeMap) d0[i]).mo16518q();
                                i++;
                            } while (i < h0);
                        }
                        snapshotStateObserver.f23145c = false;
                    } catch (Throwable th) {
                        snapshotStateObserver.f23145c = false;
                        throw th;
                    }
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        } while (this.this$0.mo16501n());
    }
}
