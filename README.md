# Draggable Floating Action Button
This is a basic implementation of a draggable Floating Action Button in Android.

## Instructions

1. Implement a simple Floating Action Button.

2. Create a custom DraggableFloatingActionButton class which extends FloatingActionButton and implemets View.OnTouchListener.

```
public class DraggableFloatingActionButton extends FloatingActionButton implements View.OnTouchListener

```

In this we use the MotionEvent class to track the finger movements and position the FAB accordingly.

3. Replace the 'android.support.design.widget.FloatingActionButton' with 'com.package-name.custom-class-name' which in this case is 'com.example.saurabhmathur.draggablefab.DraggableFloatingActionButton'

## Acknowledgments

https://stackoverflow.com/a/46373935

