def call() {
    echo 'Running Pre-Prod Pipeline...'
    sh '''
        cd /home/kaaba/mlops_assignment
        /home/kaaba/mlops_assignment/venv/bin/python train.py
    '''
    echo 'Pre-Prod Pipeline completed. Alias: Challenger-post-test.'
}
