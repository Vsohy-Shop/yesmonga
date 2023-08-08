package com.urbanairship.automation;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.automation.C8823d;
import com.urbanairship.iam.C9237v;
import com.urbanairship.iam.InAppMessage;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.s */
public class C8932s implements C8818b0<InAppMessage> {

    /* renamed from: a */
    public C9237v f23948a;

    public C8932s(C9237v vVar) {
        this.f23948a = vVar;
    }

    /* renamed from: a */
    public void mo17292a(@C0359n0 C8996y<? extends C8800a0> yVar) {
        if ("in_app_message".equals(yVar.mo17741J())) {
            this.f23948a.mo18561G(yVar.mo17733B(), (InAppMessage) yVar.mo17744r());
        }
    }

    /* renamed from: b */
    public int mo17293b(@C0359n0 C8996y<? extends C8800a0> yVar) {
        return this.f23948a.mo18555A(yVar.mo17733B());
    }

    /* renamed from: d */
    public void mo17295d(@C0359n0 C8996y<? extends C8800a0> yVar, @C0359n0 C8823d.C8824a aVar) {
        this.f23948a.mo18557C(yVar.mo17733B(), aVar);
    }

    /* renamed from: e */
    public void mo17296e(@C0359n0 C8996y<? extends C8800a0> yVar) {
        this.f23948a.mo18559E(yVar.mo17733B());
    }

    /* renamed from: f */
    public void mo17297f(@C0359n0 C8996y<? extends C8800a0> yVar) {
        InAppMessage inAppMessage;
        if ("in_app_message".equals(yVar.mo17741J())) {
            inAppMessage = (InAppMessage) yVar.mo17744r();
        } else {
            inAppMessage = null;
        }
        this.f23948a.mo18558D(yVar.mo17733B(), yVar.mo17746t(), yVar.mo17738G(), inAppMessage);
    }

    /* renamed from: g */
    public void mo17298g(@C0359n0 C8996y<? extends C8800a0> yVar) {
        this.f23948a.mo18560F(yVar.mo17733B());
    }

    /* renamed from: h */
    public void mo17294c(@C0359n0 C8996y<? extends C8800a0> yVar, @C0359n0 InAppMessage inAppMessage, @C0359n0 C8823d.C8826c cVar) {
        this.f23948a.mo18562H(yVar.mo17733B(), yVar.mo17746t(), yVar.mo17738G(), inAppMessage, cVar);
    }
}
