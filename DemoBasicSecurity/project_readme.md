default creds
username - user
passowrd - in console


AuthenticationManager -> does authentication  
	authenticate()
	
AuthenticationManagerBuilder -> builder class for the above
	to configure the manager
	configure(AuthenticationManagerBuilder auth)
	
	What type of authentication you want 
		UsernamePasswordAuthenticationFilter
		FormLoginAuthenticationFilter
		AnonymousAuthenticationFilter
		RememberMeAuthenticationFilter
		AuthenticationFilter
		
	configure(AuthenticationManagerBuilder auth) override this and do configuration


user 1 - user
password - user

user 2 - admin
password - admin

user 3 - superadmin
password - superadmin
