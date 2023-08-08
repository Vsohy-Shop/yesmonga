package androidx.compose.p004ui.node;

import android.view.KeyEvent;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.semantics.C16041n;
import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.input.C16319s0;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.unit.C16479d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.node.j1 */
public interface C15698j1 {
    @C16259h
    /* renamed from: n */
    static /* synthetic */ void m70339n() {
    }

    @C12579k
    C16479d getDensity();

    @C12579k
    C16041n getSemanticsOwner();

    @C16259h
    @C12580l
    C16319s0 getTextInputForTests() {
        return null;
    }

    @C12579k
    C16321t0 getTextInputService();

    @C8761g
    /* renamed from: p */
    void mo45042p() {
    }

    /* renamed from: x */
    boolean mo45043x(@C12579k KeyEvent keyEvent);
}
