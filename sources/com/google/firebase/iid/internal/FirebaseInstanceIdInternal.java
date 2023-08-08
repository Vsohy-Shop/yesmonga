package com.google.firebase.iid.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.tasks.C31047k;
import java.io.IOException;

@C40473a
public interface FirebaseInstanceIdInternal {

    @C40473a
    public interface NewTokenListener {
        @C40473a
        void onNewToken(String str);
    }

    @C40473a
    void addNewTokenListener(NewTokenListener newTokenListener);

    @C40473a
    void deleteToken(@C0359n0 String str, @C0359n0 String str2) throws IOException;

    @C40473a
    String getId();

    @C0363p0
    @C40473a
    String getToken();

    @C40473a
    @C0359n0
    C31047k<String> getTokenTask();
}
