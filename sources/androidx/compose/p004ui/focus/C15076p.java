package androidx.compose.p004ui.focus;

import android.view.KeyEvent;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.input.rotary.C15515d;
import androidx.compose.p004ui.unit.LayoutDirection;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.focus.p */
public interface C15076p extends C15068j {
    /* renamed from: a */
    void mo42071a(@C12579k LayoutDirection layoutDirection);

    @C12579k
    /* renamed from: b */
    C8767m mo42072b();

    /* renamed from: c */
    void mo42073c(@C12579k C15064g gVar);

    /* renamed from: d */
    void mo42074d();

    /* renamed from: e */
    void mo42075e(boolean z, boolean z2);

    /* renamed from: f */
    void mo42076f(@C12579k FocusTargetModifierNode focusTargetModifierNode);

    @C12579k
    LayoutDirection getLayoutDirection();

    /* renamed from: i */
    boolean mo42079i(@C12579k C15515d dVar);

    /* renamed from: j */
    void mo42080j(@C12579k C15078r rVar);

    @C12580l
    /* renamed from: k */
    C15098i mo42081k();

    /* renamed from: l */
    void mo42082l();

    /* renamed from: n */
    boolean mo42084n(@C12579k KeyEvent keyEvent);
}
