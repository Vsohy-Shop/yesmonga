package com.onetrust.otpublishers.headless.Public;

import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;

public interface OTCallback {
    void onFailure(@C0359n0 OTResponse oTResponse);

    void onSuccess(@C0359n0 OTResponse oTResponse);
}
