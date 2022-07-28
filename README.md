# CSE4471_Android_Safe_keyboard
# Android_Safe_keyboard
## Introduction

To prevent password leaking, we would likely to use a virtual safe keyboard to protect our password；  


## How to use

### First：Insert the codes below into the layout files such as any 'Activity' or 'Fragment'：

    <android.inputmethodservice.KeyboardView
           android:id="@+id/keyboard_view"
           android:layout_width="fill_parent"
           android:layout_height="wrap_content"
           android:layout_alignParentBottom="true"
           android:focusable="true"
           android:focusableInTouchMode="true"
           android:keyBackground="@drawable/btn_keyboard_key"
           android:keyTextColor="#ffffffff"
           android:visibility="gone" />

### If the layout file is not 'RelativeLayout',then add the codes below to the bottom：

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <android.inputmethodservice.KeyboardView
           android:id="@+id/keyboard_view"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_alignParentBottom="true"
           android:focusable="true"
           android:focusableInTouchMode="true"
           android:keyBackground="@drawable/btn_keyboard_key"
           android:keyTextColor="#ffffffff"
           android:visibility="gone" />
    <RelativeLayout/>

### Second：Insert the codes into function onCreate(), onCreateView() of the 'Activity' or 'Fragment'：

    KeyboardView mKeyboardView;
    mKeyboardView =   (KeyboardView)findViewById(R.id.keyboard_view);
    new SecKeyboardView(this, mPassword,mKeyboardView);

## Android Studio fast build:

    dependencies {
        compile 'com.kejiwen.securitykeyboard:securitykeyboardlibrary:1.0.0'
    }
