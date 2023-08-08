package com.usabilla.sdk.ubform.screenshot.annotation.paint;

import android.content.Context;
import android.view.View;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import com.usabilla.sdk.ubform.screenshot.annotation.C9893d;
import com.usabilla.sdk.ubform.screenshot.annotation.C9898h;
import com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationFlowCommand;
import com.usabilla.sdk.ubform.screenshot.annotation.UbDraft;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UbPaintPlugin implements C9893d<C9900a>, C9898h {
    @C12579k

    /* renamed from: a */
    public final UbAnnotationFlowCommand f27181a = UbAnnotationFlowCommand.DONE_AND_UNDO;
    @C12579k

    /* renamed from: b */
    public final UbPaintMenu f27182b;
    @C12579k

    /* renamed from: c */
    public final String f27183c;
    @C12580l

    /* renamed from: d */
    public UbDrawingView f27184d;

    /* renamed from: e */
    public boolean f27185e;
    @C12579k

    /* renamed from: f */
    public C11300l<? super Boolean, C11079d2> f27186f;

    public UbPaintPlugin(@C12579k UbColors ubColors) {
        Intrinsics.checkNotNullParameter(ubColors, C9874a.f27063h);
        this.f27182b = new UbPaintMenu(ubColors);
        this.f27183c = "number_of_drawings";
        this.f27186f = UbPaintPlugin$undoListener$1.f27187f;
    }

    @C12579k
    /* renamed from: b */
    public UbAnnotationFlowCommand mo20455b() {
        return this.f27181a;
    }

    /* renamed from: c */
    public void mo20456c(@C12579k C11300l<? super Boolean, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "value");
        this.f27186f = lVar;
        UbDrawingView ubDrawingView = this.f27184d;
        if (ubDrawingView != null) {
            ubDrawingView.setUndoListener(lVar);
        }
    }

    @C12580l
    /* renamed from: d */
    public UbDraft mo20457d() {
        UbDrawingView ubDrawingView = this.f27184d;
        if (ubDrawingView == null) {
            return null;
        }
        return ubDrawingView.getPaintItem();
    }

    /* renamed from: e */
    public boolean mo20472e() {
        return this.f27185e;
    }

    /* renamed from: f */
    public void mo20458f() {
        UbDrawingView ubDrawingView = this.f27184d;
        if (ubDrawingView != null) {
            ubDrawingView.setUndoListener((C11300l<? super Boolean, C11079d2>) null);
        }
        this.f27184d = null;
    }

    @C12579k
    /* renamed from: g */
    public View mo20459g(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f27185e = true;
        UbDrawingView ubDrawingView = new UbDrawingView(context);
        this.f27184d = ubDrawingView;
        ubDrawingView.setUndoListener(mo20463i());
        mo20463i().invoke(Boolean.FALSE);
        mo20454a().mo20391b(new UbPaintPlugin$onActive$1$1(ubDrawingView));
        return ubDrawingView;
    }

    public int getIcon() {
        return C9747c.C9755h.ub_ic_pencil;
    }

    @C12580l
    public View getView() {
        return this.f27184d;
    }

    /* renamed from: h */
    public void mo20462h() {
        UbDrawingView ubDrawingView = this.f27184d;
        if (ubDrawingView != null) {
            ubDrawingView.mo20479f();
        }
    }

    @C12579k
    /* renamed from: i */
    public C11300l<Boolean, C11079d2> mo20463i() {
        return this.f27186f;
    }

    @C12579k
    /* renamed from: j */
    public String mo20473j() {
        return this.f27183c;
    }

    /* renamed from: k */
    public void mo20464k() {
    }

    @C12579k
    /* renamed from: l */
    public UbPaintMenu mo20454a() {
        return this.f27182b;
    }
}
