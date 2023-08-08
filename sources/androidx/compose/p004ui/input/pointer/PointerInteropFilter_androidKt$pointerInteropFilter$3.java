package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3 */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements C11300l<MotionEvent, Boolean> {
    final /* synthetic */ AndroidViewHolder $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$view = androidViewHolder;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z = this.$view.dispatchTouchEvent(motionEvent);
                break;
            default:
                z = this.$view.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(z);
    }
}
