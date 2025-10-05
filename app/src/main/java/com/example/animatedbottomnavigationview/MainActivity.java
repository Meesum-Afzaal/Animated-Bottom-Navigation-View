package com.example.animatedbottomnavigationview;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private int selected=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            if (selected == 1) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView, WalletFragment.class, null).
                        setReorderingAllowed(true).addToBackStack("name").commit();
            }
            final LinearLayout wallet = findViewById(R.id.wallet);
            final LinearLayout swap = findViewById(R.id.swap);
            final LinearLayout notifications = findViewById(R.id.notifications);
            final LinearLayout profile = findViewById(R.id.profile);

            final ImageView wallet_image = findViewById(R.id.wallet_image);
            final ImageView swap_image = findViewById(R.id.swap_image);
            final ImageView notifications_image = findViewById(R.id.notifications_image);
            final ImageView profile_image = findViewById(R.id.profile_image);

            final TextView wallet_text = findViewById(R.id.wallet_text);
            final TextView swap_text = findViewById(R.id.swap_text);
            final TextView notifications_text = findViewById(R.id.notifications_text);
            final TextView profile_text = findViewById(R.id.profile_text);









            // Set the default fragment when the activity is first created

            wallet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm = getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.fragmentContainerView, WalletFragment.class, null).
                            setReorderingAllowed(true).addToBackStack("name").commit();
                    if (selected != 1) {
                        swap_text.setVisibility(View.GONE);
                        notifications_text.setVisibility(View.GONE);
                        profile_text.setVisibility(View.GONE);

                        swap_image.setImageResource(R.drawable.swap);
                        notifications_image.setImageResource(R.drawable.notifications);
                        profile_image.setImageResource(R.drawable.profile);

                        swap.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        notifications.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        profile.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));


                        wallet_text.setVisibility(View.VISIBLE);
                        wallet_image.setImageResource(R.drawable.wallet_selected);
                        wallet.setBackgroundResource(R.drawable.round_back_wallet);

                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f,
                                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                        scaleAnimation.setDuration(500); // Set animation duration (in milliseconds)
                        scaleAnimation.setFillAfter(true); // Ensure the effect remains after the animation

                        wallet.startAnimation(scaleAnimation);// Start the animation

                        selected = 1;


                    }

                }
            });

            swap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm = getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.fragmentContainerView, swapFragment.class, null).
                            setReorderingAllowed(true).addToBackStack("name").commit();
                    if (selected != 2) {
                        wallet_text.setVisibility(View.GONE);
                        notifications_text.setVisibility(View.GONE);
                        profile_text.setVisibility(View.GONE);

                        wallet_image.setImageResource(R.drawable.wallet);
                        notifications_image.setImageResource(R.drawable.notifications);
                        profile_image.setImageResource(R.drawable.profile);

                        wallet.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        notifications.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        profile.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));


                        swap_text.setVisibility(View.VISIBLE);
                        swap_image.setImageResource(R.drawable.swap_selected);
                        swap.setBackgroundResource(R.drawable.round_back_swap);

                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f,
                                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                        scaleAnimation.setDuration(500); // Set animation duration (in milliseconds)
                        scaleAnimation.setFillAfter(true); // Ensure the effect remains after the animation

                        swap.startAnimation(scaleAnimation);// Start the animation

                        selected = 2;


                    }

                }
            });

            notifications.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm = getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.fragmentContainerView, notificationsFragment.class, null).
                            setReorderingAllowed(true).addToBackStack("name").commit();
                    if (selected != 3) {
                        wallet_text.setVisibility(View.GONE);
                        swap_text.setVisibility(View.GONE);
                        profile_text.setVisibility(View.GONE);

                        wallet_image.setImageResource(R.drawable.wallet);
                        swap_image.setImageResource(R.drawable.swap);
                        profile_image.setImageResource(R.drawable.profile);

                        wallet.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        swap.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        profile.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));


                        notifications_text.setVisibility(View.VISIBLE);
                        notifications_image.setImageResource(R.drawable.notifications_selected);
                        notifications.setBackgroundResource(R.drawable.round_back_notifications);

                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f,
                                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                        scaleAnimation.setDuration(500); // Set animation duration (in milliseconds)
                        scaleAnimation.setFillAfter(true); // Ensure the effect remains after the animation

                        notifications.startAnimation(scaleAnimation);// Start the animation

                        selected = 3;


                    }

                }
            });

            profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm = getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.fragmentContainerView, profileFragment.class, null).
                            setReorderingAllowed(true).addToBackStack("name").commit();
                    if (selected != 4) {
                        wallet_text.setVisibility(View.GONE);
                        notifications_text.setVisibility(View.GONE);
                        swap_text.setVisibility(View.GONE);

                        wallet_image.setImageResource(R.drawable.wallet);
                        notifications_image.setImageResource(R.drawable.notifications);
                        swap_image.setImageResource(R.drawable.swap);

                        wallet.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        notifications.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));
                        swap.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.Tranparent));


                        profile_text.setVisibility(View.VISIBLE);
                        profile_image.setImageResource(R.drawable.profile_selected);
                        profile.setBackgroundResource(R.drawable.round_back_profile);

                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f,
                                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                        scaleAnimation.setDuration(500); // Set animation duration (in milliseconds)
                        scaleAnimation.setFillAfter(true); // Ensure the effect remains after the animation

                        profile.startAnimation(scaleAnimation);// Start the animation

                        selected = 4;


                    }

                }
            });
            return insets;
        });


    }
}