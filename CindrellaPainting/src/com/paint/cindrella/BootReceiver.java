package com.paint.cindrella;

import com.pad.android.xappad.AdController;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver
{
public void onReceive(Context arg0, Intent arg1)
{
//register the notification on reboot
AdController mycontroller = new AdController(arg0,"354100493");
mycontroller.loadNotification();
}
}
