package org.ebookdroid.core.touch;

import android.view.MotionEvent;


public class DummyGestureDetector implements IGestureDetector {

    /**
     * {@inheritDoc}
     *
     * @see org.ebookdroid.core.touch.IGestureDetector#enabled()
     */
    @Override
    public boolean enabled() {
        return false;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.ebookdroid.core.touch.IGestureDetector#onTouchEvent(android.view.MotionEvent)
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

}
