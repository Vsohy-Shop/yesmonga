package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.af */
public final class C21860af {
    @VisibleForTesting
    public static long AFKeystoreWrapper = 500;
    public static C21866d valueOf;

    /* renamed from: com.appsflyer.internal.af$d */
    public interface C21866d {
        void AFInAppEventParameterName(Activity activity);

        void AFInAppEventParameterName(Context context);
    }

    public static void AFKeystoreWrapper(Context context, C21866d dVar, final Executor executor) {
        valueOf = dVar;
        C218615 r1 = new Application.ActivityLifecycleCallbacks() {
            boolean AFKeystoreWrapper;
            boolean valueOf = true;

            public final void onActivityCreated(@NonNull final Activity activity, Bundle bundle) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C21997i.AFKeystoreWrapper();
                        Intent intent = activity.getIntent();
                        if (C21997i.values(intent) != null && intent != C21997i.valueOf) {
                            C21997i.valueOf = intent;
                        }
                    }
                });
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(@NonNull final Activity activity) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C218615.this.valueOf = true;
                        final Context applicationContext = activity.getApplicationContext();
                        try {
                            new Timer().schedule(new TimerTask() {
                                public final void run() {
                                    C218615 r0 = C218615.this;
                                    if (r0.AFKeystoreWrapper && r0.valueOf) {
                                        r0.AFKeystoreWrapper = false;
                                        try {
                                            C21860af.valueOf.AFInAppEventParameterName(applicationContext);
                                        } catch (Exception e) {
                                            AFLogger.AFKeystoreWrapper("Listener threw exception! ", e);
                                        }
                                    }
                                }
                            }, C21860af.AFKeystoreWrapper);
                        } catch (Throwable th) {
                            AFLogger.AFKeystoreWrapper("Background task failed with a throwable: ", th);
                        }
                    }
                });
            }

            public final void onActivityResumed(final Activity activity) {
                executor.execute(new Runnable() {
                    public final void run() {
                        if (!C218615.this.AFKeystoreWrapper) {
                            try {
                                C21860af.valueOf.AFInAppEventParameterName(activity);
                            } catch (Exception e) {
                                AFLogger.valueOf("Listener thrown an exception: ", (Throwable) e);
                            }
                        }
                        C218615 r0 = C218615.this;
                        r0.valueOf = false;
                        r0.AFKeystoreWrapper = true;
                    }
                });
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }
        };
        if (context instanceof Activity) {
            r1.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(r1);
    }
}
