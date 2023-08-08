package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import androidx.lifecycle.C19476v0;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10167b;
import dagger.hilt.android.components.C10171f;
import dagger.hilt.android.internal.lifecycle.C10207e;
import dagger.hilt.codegen.C10264a;
import dagger.multibindings.C10352d;
import dagger.multibindings.C10353e;
import dagger.multibindings.C10356h;

@C10264a(topLevelClass = CreateOrAttachCardViewModel.class)
public final class CreateOrAttachCardViewModel_HiltModules {

    @C10267e({C10171f.class})
    @C10159h
    public static abstract class BindsModule {
        private BindsModule() {
        }

        @C10356h("com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel")
        @C10147a
        @C10207e
        @C10352d
        public abstract C19476v0 binds(CreateOrAttachCardViewModel createOrAttachCardViewModel);
    }

    @C10267e({C10167b.class})
    @C10159h
    public static final class KeyModule {
        private KeyModule() {
        }

        @C10207e.C10208a
        @C10315i
        @C10353e
        public static String provide() {
            return "com.carrefour.fid.android.loyalty.presentation.viewmodels.create.CreateOrAttachCardViewModel";
        }
    }

    private CreateOrAttachCardViewModel_HiltModules() {
    }
}
