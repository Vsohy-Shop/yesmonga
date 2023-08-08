package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.DecodeHintType;
import com.google.zxing.client.android.C34661l;
import java.util.HashMap;
import java.util.List;

public class BarcodeView extends CameraPreview {

    /* renamed from: U0 */
    public DecodeMode f84812U0 = DecodeMode.NONE;

    /* renamed from: V0 */
    public C34906a f84813V0 = null;

    /* renamed from: W0 */
    public C34949n f84814W0;

    /* renamed from: X0 */
    public C34947l f84815X0;

    /* renamed from: Y0 */
    public Handler f84816Y0;

    /* renamed from: Z0 */
    public final Handler.Callback f84817Z0 = new C34896a();

    public enum DecodeMode {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    /* renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    public class C34896a implements Handler.Callback {
        public C34896a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C34661l.C34666e.zxing_decode_succeeded) {
                C34908c cVar = (C34908c) message.obj;
                if (!(cVar == null || BarcodeView.this.f84813V0 == null || BarcodeView.this.f84812U0 == DecodeMode.NONE)) {
                    BarcodeView.this.f84813V0.mo103361b(cVar);
                    if (BarcodeView.this.f84812U0 == DecodeMode.SINGLE) {
                        BarcodeView.this.mo103269P();
                    }
                }
                return true;
            } else if (i == C34661l.C34666e.zxing_decode_failed) {
                return true;
            } else {
                if (i != C34661l.C34666e.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.f84813V0 == null || BarcodeView.this.f84812U0 == DecodeMode.NONE)) {
                    BarcodeView.this.f84813V0.mo103360a(list);
                }
                return true;
            }
        }
    }

    public BarcodeView(Context context) {
        super(context);
        mo103266M();
    }

    /* renamed from: I */
    public final C34946k mo103262I() {
        if (this.f84815X0 == null) {
            this.f84815X0 = mo103263J();
        }
        C34948m mVar = new C34948m();
        HashMap hashMap = new HashMap();
        hashMap.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, mVar);
        C34946k a = this.f84815X0.mo103529a(hashMap);
        mVar.mo103531c(a);
        return a;
    }

    /* renamed from: J */
    public C34947l mo103263J() {
        return new C34952o();
    }

    /* renamed from: K */
    public void mo103264K(C34906a aVar) {
        this.f84812U0 = DecodeMode.CONTINUOUS;
        this.f84813V0 = aVar;
        mo103267N();
    }

    /* renamed from: L */
    public void mo103265L(C34906a aVar) {
        this.f84812U0 = DecodeMode.SINGLE;
        this.f84813V0 = aVar;
        mo103267N();
    }

    /* renamed from: M */
    public final void mo103266M() {
        this.f84815X0 = new C34952o();
        this.f84816Y0 = new Handler(this.f84817Z0);
    }

    /* renamed from: N */
    public final void mo103267N() {
        mo103268O();
        if (this.f84812U0 != DecodeMode.NONE && mo103311u()) {
            C34949n nVar = new C34949n(getCameraInstance(), mo103262I(), this.f84816Y0);
            this.f84814W0 = nVar;
            nVar.mo103537k(getPreviewFramingRect());
            this.f84814W0.mo103539m();
        }
    }

    /* renamed from: O */
    public final void mo103268O() {
        C34949n nVar = this.f84814W0;
        if (nVar != null) {
            nVar.mo103540n();
            this.f84814W0 = null;
        }
    }

    /* renamed from: P */
    public void mo103269P() {
        this.f84812U0 = DecodeMode.NONE;
        this.f84813V0 = null;
        mo103268O();
    }

    public C34947l getDecoderFactory() {
        return this.f84815X0;
    }

    public void setDecoderFactory(C34947l lVar) {
        C34961w.m142988a();
        this.f84815X0 = lVar;
        C34949n nVar = this.f84814W0;
        if (nVar != null) {
            nVar.mo103538l(mo103262I());
        }
    }

    /* renamed from: w */
    public void mo103272w() {
        mo103268O();
        super.mo103272w();
    }

    /* renamed from: z */
    public void mo103273z() {
        super.mo103273z();
        mo103267N();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo103266M();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo103266M();
    }
}
