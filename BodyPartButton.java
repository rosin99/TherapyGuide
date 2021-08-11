//
// Name:    BodyPartButton.java - Data class that holds information for body part buttons
// Type:    Java source file
// Program: TherapyGuide Physical Therapy Helper
// Author:  Aryan Samal
// Version: 1.0
//
// Copyright 2020, This software is confidential and proprietary to the author.
//

import javax.swing.*;

//
// BodyPartButton Class:
// Data class that holds information for each body part button.
class BodyPartButton
{
    // defines
    JButton mButton;
    String mBodyPartName;
    String mIcon;

    //
    // BodyPartButton:
    // BodyPartButton constructor that gives values to the the name of the button, the JButton Object,
    // and the String icon
    public BodyPartButton(JButton pButton, String pBodyPartName, String pIcon)
    {
        mButton = pButton;
        mBodyPartName = pBodyPartName;
        mIcon = pIcon;
    }

    //
    // getmBodyPartName:
    // returns String representation of the body part name for the physical therapy exercise
    public String getmBodyPartName()
    {
        return mBodyPartName;
    }

    //
    // getButton:
    // return the JButton object
    public JButton getmButton()
    {
        return mButton;
    }

    //
    // setmButton:
    // sets the JButton object of the BodyPartButton instance
    public void setmButton(JButton mButton)
    {
        this.mButton = mButton;
    }
}
