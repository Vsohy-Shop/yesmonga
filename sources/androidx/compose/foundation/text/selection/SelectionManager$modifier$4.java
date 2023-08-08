package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.p004ui.input.key.C15436b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/key/b;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SelectionManager$modifier$4 extends Lambda implements C11300l<C15436b, Boolean> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo9684a(@C12579k KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(keyEvent, "it");
        if (SelectionManager_androidKt.m12804a(keyEvent)) {
            this.this$0.mo9663o();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo9684a(((C15436b) obj).mo43922h());
    }
}
