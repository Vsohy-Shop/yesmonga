package com.urbanairship.modules;

import android.content.Context;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.actions.C35492e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Module {
    @C0359n0

    /* renamed from: a */
    public final Set<? extends C36040b> f25726a;
    @C0351j1

    /* renamed from: b */
    public final int f25727b;

    public Module(@C0359n0 Set<? extends C36040b> set) {
        this(set, 0);
    }

    @C0359n0
    public static Module multipleComponents(@C0359n0 Collection<C36040b> collection, @C0351j1 int i) {
        return new Module(new HashSet(collection), i);
    }

    @C0359n0
    public static Module singleComponent(@C0359n0 C36040b bVar, @C0351j1 int i) {
        return new Module(Collections.singleton(bVar), i);
    }

    @C0359n0
    public Set<? extends C36040b> getComponents() {
        return this.f25726a;
    }

    public void registerActions(@C0359n0 Context context, @C0359n0 C35492e eVar) {
        int i = this.f25727b;
        if (i != 0) {
            eVar.mo106355e(context, i);
        }
    }

    public Module(@C0359n0 Set<? extends C36040b> set, @C0351j1 int i) {
        this.f25726a = set;
        this.f25727b = i;
    }
}
