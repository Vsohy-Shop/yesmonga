package com.urbanairship.channel;

import androidx.arch.core.util.C0843a;
import com.urbanairship.C36071u;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9637a0;
import java.util.List;

/* renamed from: com.urbanairship.channel.p */
public class C9042p extends C9637a0<C9004a0> {

    /* renamed from: com.urbanairship.channel.p$a */
    public class C9043a implements C0843a<C9004a0, C9333e> {
        /* renamed from: a */
        public C9333e apply(C9004a0 a0Var) {
            return a0Var;
        }
    }

    /* renamed from: com.urbanairship.channel.p$b */
    public class C9044b implements C0843a<JsonValue, C9004a0> {
        /* renamed from: a */
        public C9004a0 apply(JsonValue jsonValue) {
            return C9004a0.m33499d(jsonValue);
        }
    }

    /* renamed from: com.urbanairship.channel.p$c */
    public class C9045c implements C0843a<List<C9004a0>, List<C9004a0>> {
        public C9045c() {
        }

        /* renamed from: a */
        public List<C9004a0> apply(List<C9004a0> list) {
            return C9004a0.m33497b(list);
        }
    }

    public C9042p(C36071u uVar, String str) {
        super(uVar, str, new C9043a(), new C9044b());
    }

    /* renamed from: h */
    public void mo17892h() {
        mo19597c(new C9045c());
    }
}
