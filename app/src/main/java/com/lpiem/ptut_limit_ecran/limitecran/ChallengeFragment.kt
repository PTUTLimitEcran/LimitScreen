package com.lpiem.ptut_limit_ecran.limitecran

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_challenge.*

private const val ARG_PARAM1 = "param1"

class ChallengeFragment() : Fragment(), View.OnClickListener{
    override fun onClick(v: View?) {
        when(v) {
            challenge1 -> challengeUpdateManager.setNewChallenge()
            challenge2 -> challengeUpdateManager.setNewChallenge()
            challenge3 -> challengeUpdateManager.setNewChallenge()
            challenge4 -> challengeUpdateManager.setNewChallenge()

        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: ChallengeUpdateManager) =
            ChallengeFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)

                }
            }
    }

    private lateinit var challengeUpdateManager:ChallengeUpdateManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            challengeUpdateManager = it.getSerializable(ARG_PARAM1) as ChallengeUpdateManager
            challengeUpdateManager
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater?.inflate(R.layout.fragment_challenge, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        challenge1.setOnClickListener(this)
        challenge2.setOnClickListener(this)
        challenge3.setOnClickListener(this)
        challenge4.setOnClickListener(this)
    }

}