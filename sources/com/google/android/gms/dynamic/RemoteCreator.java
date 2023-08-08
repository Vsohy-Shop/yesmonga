package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;

@C40473a
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    public final String f104290a;

    /* renamed from: b */
    public Object f104291b;

    @C40473a
    public static class RemoteCreatorException extends Exception {
        @C40473a
        public RemoteCreatorException(@C0359n0 String str) {
            super(str);
        }

        @C40473a
        public RemoteCreatorException(@C0359n0 String str, @C0359n0 Throwable th) {
            super(str, th);
        }
    }

    @C40473a
    public RemoteCreator(@C0359n0 String str) {
        this.f104290a = str;
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public abstract T mo134329a(@C0359n0 IBinder iBinder);

    @C40473a
    @C0359n0
    /* renamed from: b */
    public final T mo134795b(@C0359n0 Context context) throws RemoteCreatorException {
        if (this.f104291b == null) {
            C40843u.m166202l(context);
            Context i = C40864j.m166235i(context);
            if (i != null) {
                try {
                    this.f104291b = mo134329a((IBinder) i.getClassLoader().loadClass(this.f104290a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f104291b;
    }
}
