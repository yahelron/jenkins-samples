Node{ stages(){
  stage(“checkout”){
    Git 'https://github.com/avielb/hw-14'
    }
    stage(“Run playbook”){
    Sh 'ansible-playbook site.yml'
    }
  }
}
