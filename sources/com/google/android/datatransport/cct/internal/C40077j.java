package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;
import com.google.firebase.encoders.C32994a;
import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.json.C33013e;
import java.util.List;

@C32455c
@C32995a
/* renamed from: com.google.android.datatransport.cct.internal.j */
public abstract class C40077j {
    @C0359n0
    /* renamed from: a */
    public static C40077j m163197a(@C0359n0 List<C40080l> list) {
        return new C40063d(list);
    }

    @C0359n0
    /* renamed from: b */
    public static C32994a m163198b() {
        return new C33013e().mo95639k(C40053b.f102179b).mo95640l(true).mo95638j();
    }

    @C0359n0
    @C32995a.C32996a(name = "logRequest")
    /* renamed from: c */
    public abstract List<C40080l> mo132614c();
}
