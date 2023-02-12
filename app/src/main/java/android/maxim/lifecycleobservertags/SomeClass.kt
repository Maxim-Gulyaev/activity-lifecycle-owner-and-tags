package android.maxim.lifecycleobservertags

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class SomeClass: DefaultLifecycleObserver {

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("lifecycle", "doing my action")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("lifecycle", "doing another action")
    }
}